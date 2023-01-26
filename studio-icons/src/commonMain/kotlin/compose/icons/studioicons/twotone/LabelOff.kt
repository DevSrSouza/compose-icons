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

public val TwotoneGroup.LabelOff: ImageVector
    get() {
        if (_labelOff != null) {
            return _labelOff!!
        }
        _labelOff = Builder(name = "LabelOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 7.03f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(9.97f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(-5.37f)
                lineToRelative(7.29f, 7.29f)
                lineTo(19.55f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                lineToRelative(3.55f, 5.0f)
                lineToRelative(-1.63f, 2.29f)
                lineToRelative(1.43f, 1.43f)
                lineTo(22.0f, 12.0f)
                lineToRelative(-4.37f, -6.16f)
                curveTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f)
                lineToRelative(-7.37f, 0.01f)
                lineToRelative(2.0f, 1.99f)
                lineTo(16.0f, 7.0f)
                close()
                moveTo(2.0f, 4.03f)
                lineToRelative(1.58f, 1.58f)
                curveTo(3.22f, 5.96f, 3.0f, 6.46f, 3.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 1.99f, 2.0f, 1.99f)
                lineTo(16.0f, 19.0f)
                curveToRelative(0.28f, 0.0f, 0.55f, -0.07f, 0.79f, -0.18f)
                lineTo(18.97f, 21.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.41f, 2.62f)
                lineTo(2.0f, 4.03f)
                close()
                moveTo(5.0f, 7.03f)
                lineTo(14.97f, 17.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.03f)
                close()
            }
        }
        .build()
        return _labelOff!!
    }

private var _labelOff: ImageVector? = null
