package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PhotoCameraBack: ImageVector
    get() {
        if (_photoCameraBack != null) {
            return _photoCameraBack!!
        }
        _photoCameraBack = Builder(name = "PhotoCameraBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.17f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(1.83f, 2.0f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(20.0f, 19.0f)
                lineTo(20.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(14.0f, 12.0f)
                lineToRelative(-3.0f, 3.72f)
                lineTo(9.0f, 13.0f)
                lineToRelative(-3.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-4.0f, -5.0f)
                close()
            }
        }
        .build()
        return _photoCameraBack!!
    }

private var _photoCameraBack: ImageVector? = null
