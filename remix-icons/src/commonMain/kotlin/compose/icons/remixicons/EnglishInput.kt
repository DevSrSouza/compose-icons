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

public val RemixIcons.EnglishInput: ImageVector
    get() {
        if (_englishInput != null) {
            return _englishInput!!
        }
        _englishInput = Builder(name = "EnglishInput", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.757f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 7.0f, 3.743f)
                lineTo(23.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.43f, -1.175f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(16.0f, 13.07f, 16.0f, 14.5f)
                lineTo(16.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 10.0f)
                close()
                moveTo(12.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _englishInput!!
    }

private var _englishInput: ImageVector? = null