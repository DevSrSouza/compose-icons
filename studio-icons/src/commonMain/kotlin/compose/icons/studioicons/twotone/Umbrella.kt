package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.28f, 8.5f)
                lineToRelative(0.76f, 0.58f)
                lineToRelative(0.92f, -0.23f)
                lineTo(13.0f, 14.8f)
                verticalLineTo(8.29f)
                lineTo(13.28f, 8.5f)
                close()
                moveTo(9.03f, 8.86f)
                lineTo(11.0f, 14.8f)
                verticalLineTo(8.29f)
                lineTo(10.72f, 8.5f)
                lineTo(9.96f, 9.09f)
                lineTo(9.03f, 8.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 6.92f)
                lineTo(13.0f, 5.77f)
                verticalLineTo(3.88f)
                verticalLineTo(3.4f)
                curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.21f, 0.5f, 0.48f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.4f)
                curveTo(16.0f, 2.07f, 14.88f, 1.0f, 13.5f, 1.0f)
                curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f)
                verticalLineToRelative(0.48f)
                verticalLineToRelative(1.89f)
                lineTo(9.5f, 6.92f)
                lineTo(6.0f, 6.07f)
                lineToRelative(5.05f, 15.25f)
                curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f)
                lineTo(18.0f, 6.07f)
                lineTo(14.5f, 6.92f)
                close()
                moveTo(13.28f, 8.5f)
                lineToRelative(0.76f, 0.58f)
                lineToRelative(0.92f, -0.23f)
                lineTo(13.0f, 14.8f)
                verticalLineTo(8.29f)
                lineTo(13.28f, 8.5f)
                close()
                moveTo(9.96f, 9.09f)
                lineToRelative(0.76f, -0.58f)
                lineTo(11.0f, 8.29f)
                verticalLineToRelative(6.51f)
                lineTo(9.03f, 8.86f)
                lineTo(9.96f, 9.09f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
