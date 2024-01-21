package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Expensify: ImageVector
    get() {
        if (_expensify != null) {
            return _expensify!!
        }
        _expensify = Builder(name = "Expensify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.16f, 17.52f)
                horizontalLineToRelative(7.68f)
                verticalLineToRelative(-2.28f)
                horizontalLineToRelative(-4.872f)
                verticalLineToRelative(-2.136f)
                horizontalLineToRelative(4.152f)
                verticalLineToRelative(-2.328f)
                horizontalLineToRelative(-4.152f)
                verticalLineToRelative(-2.04f)
                horizontalLineToRelative(4.872f)
                verticalLineTo(6.48f)
                horizontalLineTo(8.16f)
                verticalLineToRelative(11.04f)
                close()
                moveTo(21.6f, 12.0f)
                arcToRelative(9.608f, 9.608f, 0.0f, false, true, -2.16f, 6.072f)
                lineToRelative(1.704f, 1.704f)
                arcTo(11.958f, 11.958f, 0.0f, false, false, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.928f, -1.056f, -5.616f, -2.784f, -7.68f)
                lineToRelative(-1.704f, 1.704f)
                arcTo(9.61f, 9.61f, 0.0f, false, true, 21.6f, 12.0f)
                close()
                moveTo(18.072f, 19.44f)
                arcToRelative(9.608f, 9.608f, 0.0f, false, true, -12.048f, 0.072f)
                lineTo(4.32f, 21.216f)
                arcTo(11.913f, 11.913f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(2.976f, 0.0f, 5.688f, -1.08f, 7.776f, -2.856f)
                lineToRelative(-1.704f, -1.704f)
                close()
                moveTo(4.632f, 18.168f)
                arcTo(9.613f, 9.613f, 0.0f, false, true, 2.4f, 12.0f)
                curveToRelative(0.0f, -5.304f, 4.296f, -9.6f, 9.6f, -9.6f)
                curveToRelative(2.352f, 0.0f, 4.488f, 0.84f, 6.168f, 2.232f)
                lineToRelative(1.704f, -1.704f)
                arcTo(12.02f, 12.02f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(5.376f, 0.0f, 0.0f, 5.376f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.0f, 1.104f, 5.76f, 2.928f, 7.872f)
                lineToRelative(1.704f, -1.704f)
                close()
            }
        }
        .build()
        return _expensify!!
    }

private var _expensify: ImageVector? = null
