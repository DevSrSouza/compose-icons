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

public val BaselineGroup.AirlineSeatFlatAngled: ImageVector
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
                lineToRelative(2.08f, -5.66f)
                lineToRelative(8.56f, 3.09f)
                curveToRelative(2.1f, 0.76f, 3.18f, 3.06f, 2.41f, 5.15f)
                close()
                moveTo(1.5f, 12.14f)
                lineTo(8.0f, 14.48f)
                lineTo(8.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.63f)
                lineTo(20.52f, 19.0f)
                lineToRelative(0.69f, -1.89f)
                lineToRelative(-19.02f, -6.86f)
                lineToRelative(-0.69f, 1.89f)
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
