package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SendAndArchive: ImageVector
    get() {
        if (_sendAndArchive != null) {
            return _sendAndArchive!!
        }
        _sendAndArchive = Builder(name = "SendAndArchive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(8.0f, 2.0f)
                lineToRelative(-8.0f, 2.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(7.0f, -2.95f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f)
                curveTo(10.0f, 13.13f, 13.13f, 10.0f, 17.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(17.0f, 20.0f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(20.0f)
                lineTo(17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _sendAndArchive!!
    }

private var _sendAndArchive: ImageVector? = null
