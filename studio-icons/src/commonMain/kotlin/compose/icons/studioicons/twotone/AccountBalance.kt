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

public val TwotoneGroup.AccountBalance: ImageVector
    get() {
        if (_accountBalance != null) {
            return _accountBalance!!
        }
        _accountBalance = Builder(name = "AccountBalance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.29f, 6.0f)
                lineToRelative(5.21f, -2.74f)
                lineTo(16.71f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(12.5f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.5f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.5f, 1.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(19.0f)
                lineTo(21.0f, 6.0f)
                lineToRelative(-9.5f, -5.0f)
                close()
                moveTo(6.29f, 6.0f)
                lineToRelative(5.21f, -2.74f)
                lineTo(16.71f, 6.0f)
                lineTo(6.29f, 6.0f)
                close()
            }
        }
        .build()
        return _accountBalance!!
    }

private var _accountBalance: ImageVector? = null
