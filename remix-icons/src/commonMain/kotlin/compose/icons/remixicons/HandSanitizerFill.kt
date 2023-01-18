package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.HandSanitizerFill: ImageVector
    get() {
        if (_handSanitizerFill != null) {
            return _handSanitizerFill!!
        }
        _handSanitizerFill = Builder(name = "HandSanitizerFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-4.0f, -0.001f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                lineTo(8.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 3.999f)
                lineTo(7.5f, 4.0f)
                curveToRelative(-0.63f, 0.0f, -1.37f, 0.49f, -2.2f, 1.6f)
                lineTo(3.7f, 4.4f)
                curveTo(4.87f, 2.84f, 6.13f, 2.0f, 7.5f, 2.0f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.999f)
                lineTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.001f, -2.0f)
                lineTo(15.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _handSanitizerFill!!
    }

private var _handSanitizerFill: ImageVector? = null
