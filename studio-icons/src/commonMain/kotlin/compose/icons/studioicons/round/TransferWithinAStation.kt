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

public val RoundGroup.TransferWithinAStation: ImageVector
    get() {
        if (_transferWithinAStation != null) {
            return _transferWithinAStation!!
        }
        _transferWithinAStation = Builder(name = "TransferWithinAStation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.5f)
                horizontalLineToRelative(-5.52f)
                verticalLineToRelative(-0.77f)
                curveToRelative(0.0f, -0.36f, -0.44f, -0.54f, -0.69f, -0.29f)
                lineToRelative(-1.51f, 1.52f)
                curveToRelative(-0.16f, 0.16f, -0.16f, 0.41f, 0.0f, 0.57f)
                lineToRelative(1.51f, 1.52f)
                curveToRelative(0.26f, 0.26f, 0.69f, 0.08f, 0.69f, -0.29f)
                lineTo(16.48f, 17.0f)
                lineTo(22.0f, 17.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(21.72f, 20.21f)
                lineToRelative(-1.51f, -1.52f)
                curveToRelative(-0.26f, -0.26f, -0.69f, -0.08f, -0.69f, 0.29f)
                verticalLineToRelative(0.77f)
                lineTo(14.0f, 19.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.52f)
                verticalLineToRelative(0.77f)
                curveToRelative(0.0f, 0.36f, 0.44f, 0.54f, 0.69f, 0.29f)
                lineToRelative(1.51f, -1.52f)
                curveToRelative(0.16f, -0.16f, 0.16f, -0.42f, 0.0f, -0.58f)
                close()
                moveTo(9.5f, 5.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(5.75f, 8.9f)
                lineTo(3.23f, 21.81f)
                curveToRelative(-0.12f, 0.62f, 0.35f, 1.19f, 0.98f, 1.19f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.47f, 0.0f, 0.88f, -0.33f, 0.98f, -0.79f)
                lineTo(6.85f, 15.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.72f)
                curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                lineTo(8.95f, 13.4f)
                lineToRelative(0.6f, -3.0f)
                curveToRelative(1.07f, 1.32f, 2.58f, 2.23f, 4.31f, 2.51f)
                curveToRelative(0.6f, 0.1f, 1.14f, -0.39f, 1.14f, -1.0f)
                curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f)
                curveToRelative(-1.49f, -0.25f, -2.75f, -1.15f, -3.51f, -2.38f)
                lineToRelative(-0.95f, -1.6f)
                curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f)
                curveToRelative(-0.25f, 0.0f, -0.5f, 0.05f, -0.75f, 0.15f)
                lineTo(3.24f, 7.79f)
                curveTo(2.49f, 8.1f, 2.0f, 8.83f, 2.0f, 9.64f)
                lineTo(2.0f, 12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(4.0f, 9.65f)
                lineToRelative(1.75f, -0.75f)
            }
        }
        .build()
        return _transferWithinAStation!!
    }

private var _transferWithinAStation: ImageVector? = null
