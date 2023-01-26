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

public val SharpGroup.RestorePage: ImageVector
    get() {
        if (_restorePage != null) {
            return _restorePage!!
        }
        _restorePage = Builder(name = "RestorePage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 8.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-2.05f, 0.0f, -3.81f, -1.24f, -4.58f, -3.0f)
                horizontalLineToRelative(1.71f)
                curveToRelative(0.63f, 0.9f, 1.68f, 1.5f, 2.87f, 1.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(13.93f, 9.5f, 12.0f, 9.5f)
                curveToRelative(-1.35f, 0.0f, -2.52f, 0.78f, -3.1f, 1.9f)
                lineToRelative(1.6f, 1.6f)
                horizontalLineToRelative(-4.0f)
                lineTo(6.5f, 9.0f)
                lineToRelative(1.3f, 1.3f)
                curveTo(8.69f, 8.92f, 10.23f, 8.0f, 12.0f, 8.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _restorePage!!
    }

private var _restorePage: ImageVector? = null
