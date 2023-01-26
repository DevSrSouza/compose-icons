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

public val SharpGroup.WavingHand: ImageVector
    get() {
        if (_wavingHand != null) {
            return _wavingHand!!
        }
        _wavingHand = Builder(name = "WavingHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 17.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                horizontalLineTo(23.0f)
                close()
                moveTo(1.0f, 7.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                verticalLineToRelative(1.5f)
                curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(8.9f, 3.43f)
                lineTo(3.42f, 8.91f)
                curveToRelative(-3.22f, 3.22f, -3.22f, 8.44f, 0.0f, 11.67f)
                reflectiveCurveToRelative(8.44f, 3.22f, 11.67f, 0.0f)
                lineToRelative(7.95f, -7.95f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-5.3f, 5.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(7.42f, -7.42f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-6.72f, 6.72f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(7.78f, -7.78f)
                lineTo(19.5f, 2.73f)
                lineToRelative(-7.78f, 7.78f)
                lineTo(11.02f, 9.8f)
                lineToRelative(6.36f, -6.36f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-8.51f, 8.51f)
                curveToRelative(1.22f, 1.57f, 1.11f, 3.84f, -0.33f, 5.28f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.08f, 0.0f, -4.24f)
                lineToRelative(-0.35f, -0.35f)
                lineToRelative(4.95f, -4.95f)
                lineTo(8.9f, 3.43f)
                close()
            }
        }
        .build()
        return _wavingHand!!
    }

private var _wavingHand: ImageVector? = null
