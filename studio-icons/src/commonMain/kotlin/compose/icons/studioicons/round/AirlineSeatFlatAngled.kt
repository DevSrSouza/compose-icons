package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AirlineSeatFlatAngled: ImageVector
    get() {
        if (_airlineSeatFlatAngled != null) {
            return _airlineSeatFlatAngled!!
        }
        _airlineSeatFlatAngled = Builder(name = "AirlineSeatFlatAngled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.25f, 14.29f)
                lineToRelative(-0.69f, 1.89f)
                lineTo(9.2f, 11.71f)
                lineToRelative(1.39f, -3.79f)
                curveToRelative(0.38f, -1.03f, 1.52f, -1.56f, 2.56f, -1.19f)
                lineToRelative(6.69f, 2.41f)
                curveToRelative(2.1f, 0.76f, 3.18f, 3.06f, 2.41f, 5.15f)
                close()
                moveTo(2.45f, 12.48f)
                lineToRelative(5.55f, 2.0f)
                lineTo(8.0f, 18.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-0.63f)
                lineToRelative(3.58f, 1.29f)
                curveToRelative(0.52f, 0.19f, 1.1f, -0.08f, 1.29f, -0.6f)
                curveToRelative(0.19f, -0.52f, -0.08f, -1.1f, -0.6f, -1.29f)
                lineTo(3.13f, 10.59f)
                curveToRelative(-0.52f, -0.19f, -1.1f, 0.08f, -1.29f, 0.6f)
                curveToRelative(-0.18f, 0.52f, 0.09f, 1.1f, 0.61f, 1.29f)
                close()
                moveTo(7.3f, 10.2f)
                curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f)
                curveTo(7.99f, 4.71f, 6.2f, 4.08f, 4.7f, 4.8f)
                curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f)
                curveToRelative(0.71f, 1.49f, 2.5f, 2.12f, 4.0f, 1.4f)
                close()
            }
        }
        .build()
        return _airlineSeatFlatAngled!!
    }

private var _airlineSeatFlatAngled: ImageVector? = null
