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

public val OutlineGroup.AirlineSeatFlatAngled: ImageVector
    get() {
        if (_airlineSeatFlatAngled != null) {
            return _airlineSeatFlatAngled!!
        }
        _airlineSeatFlatAngled = Builder(name = "AirlineSeatFlatAngled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.5f)
                curveToRelative(0.31f, 0.0f, 0.7f, 0.15f, 0.9f, 0.56f)
                curveToRelative(0.24f, 0.5f, 0.02f, 1.1f, -0.47f, 1.34f)
                curveToRelative(-0.14f, 0.06f, -0.28f, 0.1f, -0.43f, 0.1f)
                curveToRelative(-0.3f, 0.0f, -0.7f, -0.15f, -0.89f, -0.56f)
                curveToRelative(-0.17f, -0.34f, -0.1f, -0.63f, -0.05f, -0.78f)
                curveToRelative(0.05f, -0.14f, 0.18f, -0.4f, 0.51f, -0.56f)
                curveToRelative(0.14f, -0.06f, 0.28f, -0.1f, 0.43f, -0.1f)
                moveToRelative(6.47f, 2.11f)
                lineToRelative(6.69f, 2.41f)
                curveToRelative(0.52f, 0.19f, 0.93f, 0.56f, 1.15f, 1.05f)
                curveToRelative(0.22f, 0.48f, 0.25f, 1.03f, 0.06f, 1.53f)
                lineToRelative(-0.01f, 0.02f)
                lineToRelative(-8.59f, -3.11f)
                lineToRelative(0.7f, -1.9f)
                moveTo(10.0f, 15.19f)
                lineToRelative(4.0f, 1.44f)
                lineTo(14.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.81f)
                moveTo(6.0f, 4.5f)
                curveToRelative(-0.44f, 0.0f, -0.88f, 0.1f, -1.3f, 0.3f)
                curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f)
                curveToRelative(0.51f, 1.07f, 1.58f, 1.7f, 2.7f, 1.7f)
                curveToRelative(0.44f, 0.0f, 0.88f, -0.1f, 1.3f, -0.3f)
                curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f)
                curveTo(8.19f, 5.13f, 7.12f, 4.5f, 6.0f, 4.5f)
                close()
                moveTo(11.28f, 6.05f)
                lineTo(9.2f, 11.71f)
                lineToRelative(12.36f, 4.47f)
                lineToRelative(0.69f, -1.89f)
                curveToRelative(0.77f, -2.09f, -0.31f, -4.39f, -2.41f, -5.15f)
                lineToRelative(-8.56f, -3.09f)
                close()
                moveTo(2.19f, 10.25f)
                lineToRelative(-0.69f, 1.89f)
                lineTo(8.0f, 14.48f)
                lineTo(8.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.63f)
                lineTo(20.52f, 19.0f)
                lineToRelative(0.69f, -1.89f)
                lineToRelative(-19.02f, -6.86f)
                close()
            }
        }
        .build()
        return _airlineSeatFlatAngled!!
    }

private var _airlineSeatFlatAngled: ImageVector? = null
