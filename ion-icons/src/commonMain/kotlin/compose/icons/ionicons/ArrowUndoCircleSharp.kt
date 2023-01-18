package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ArrowUndoCircleSharp: ImageVector
    get() {
        if (_arrowUndoCircleSharp != null) {
            return _arrowUndoCircleSharp!!
        }
        _arrowUndoCircleSharp = Builder(name = "ArrowUndoCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(246.83f, 289.14f)
                lineTo(246.83f, 344.0f)
                lineTo(146.0f, 248.0f)
                lineToRelative(100.83f, -96.0f)
                verticalLineToRelative(54.86f)
                curveToRelative(96.5f, 0.0f, 119.17f, 69.0f, 119.17f, 137.14f)
                curveTo(338.15f, 308.43f, 313.52f, 289.14f, 246.83f, 289.14f)
                close()
            }
        }
        .build()
        return _arrowUndoCircleSharp!!
    }

private var _arrowUndoCircleSharp: ImageVector? = null
