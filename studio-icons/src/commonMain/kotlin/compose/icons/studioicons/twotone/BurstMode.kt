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

public val TwotoneGroup.BurstMode: ImageVector
    get() {
        if (_burstMode != null) {
            return _burstMode!!
        }
        _burstMode = Builder(name = "BurstMode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(10.0f)
                lineTo(21.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(14.0f, 13.47f)
                lineToRelative(1.43f, 1.72f)
                lineToRelative(2.0f, -2.58f)
                lineTo(20.0f, 15.99f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(2.0f, -2.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                lineTo(1.0f, 19.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(22.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(23.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(11.0f, 17.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(17.43f, 12.62f)
                lineToRelative(-2.0f, 2.57f)
                lineTo(14.0f, 13.47f)
                lineToRelative(-2.0f, 2.52f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _burstMode!!
    }

private var _burstMode: ImageVector? = null
