package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.RestorePage: ImageVector
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
                lineTo(6.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                lineTo(18.0f, 22.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(20.0f, 8.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 4.0f)
                horizontalLineToRelative(7.17f)
                lineTo(18.0f, 8.83f)
                lineTo(18.0f, 20.0f)
                close()
                moveTo(8.45f, 10.57f)
                lineTo(7.28f, 9.4f)
                lineTo(7.28f, 13.0f)
                horizontalLineToRelative(3.6f)
                lineToRelative(-1.44f, -1.44f)
                curveToRelative(0.52f, -1.01f, 1.58f, -1.71f, 2.79f, -1.71f)
                curveToRelative(1.74f, 0.0f, 3.15f, 1.41f, 3.15f, 3.15f)
                reflectiveCurveToRelative(-1.41f, 3.15f, -3.15f, 3.15f)
                curveToRelative(-1.07f, 0.0f, -2.02f, -0.54f, -2.58f, -1.35f)
                lineTo(8.1f, 14.8f)
                curveToRelative(0.69f, 1.58f, 2.28f, 2.7f, 4.12f, 2.7f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-1.59f, 0.0f, -2.97f, 0.83f, -3.77f, 2.07f)
                close()
            }
        }
        .build()
        return _restorePage!!
    }

private var _restorePage: ImageVector? = null