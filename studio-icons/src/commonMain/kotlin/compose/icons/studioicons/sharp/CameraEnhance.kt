package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CameraEnhance: ImageVector
    get() {
        if (_cameraEnhance != null) {
            return _cameraEnhance!!
        }
        _cameraEnhance = Builder(name = "CameraEnhance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.83f, 5.0f)
                lineTo(15.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                lineTo(7.17f, 5.0f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 5.0f)
                horizontalLineToRelative(-5.17f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(12.0f, 9.0f)
                lineToRelative(-1.25f, 2.75f)
                lineTo(8.0f, 13.0f)
                lineToRelative(2.75f, 1.25f)
                lineTo(12.0f, 17.0f)
                lineToRelative(1.25f, -2.75f)
                lineTo(16.0f, 13.0f)
                lineToRelative(-2.75f, -1.25f)
                close()
            }
        }
        .build()
        return _cameraEnhance!!
    }

private var _cameraEnhance: ImageVector? = null
