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

public val RoundGroup.Snowmobile: ImageVector
    get() {
        if (_snowmobile != null) {
            return _snowmobile!!
        }
        _snowmobile = Builder(name = "Snowmobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.25f)
                lineToRelative(1.45f, 1.3f)
                lineTo(11.0f, 11.0f)
                lineToRelative(-9.12f, -0.96f)
                curveTo(0.88f, 9.93f, 0.0f, 10.72f, 0.0f, 11.73f)
                curveToRelative(0.0f, 0.75f, 0.49f, 1.41f, 1.21f, 1.63f)
                lineToRelative(3.33f, 1.0f)
                lineToRelative(-3.49f, 1.88f)
                curveTo(-0.77f, 17.22f, -0.07f, 20.0f, 2.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.13f, 0.0f, 2.11f, -0.62f, 2.63f, -1.55f)
                curveToRelative(0.36f, -0.65f, -0.15f, -1.45f, -0.9f, -1.45f)
                curveToRelative(-0.34f, 0.0f, -0.68f, 0.16f, -0.84f, 0.47f)
                curveTo(21.72f, 17.78f, 21.38f, 18.0f, 21.0f, 18.0f)
                horizontalLineToRelative(-0.17f)
                lineToRelative(-2.2f, -2.2f)
                curveTo(20.58f, 15.37f, 22.0f, 14.4f, 22.0f, 13.0f)
                curveToRelative(0.0f, -0.89f, -7.72f, -7.75f, -7.72f, -7.75f)
                curveTo(14.1f, 5.09f, 13.87f, 5.0f, 13.62f, 5.0f)
                horizontalLineTo(12.0f)
                curveTo(11.45f, 5.0f, 11.0f, 5.45f, 11.0f, 6.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineTo(2.0f)
                lineToRelative(5.25f, -2.83f)
                lineTo(10.0f, 16.0f)
                curveTo(10.0f, 17.1f, 9.11f, 18.0f, 8.0f, 18.0f)
                close()
            }
        }
        .build()
        return _snowmobile!!
    }

private var _snowmobile: ImageVector? = null
