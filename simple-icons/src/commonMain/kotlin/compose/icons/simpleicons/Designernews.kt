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

public val SimpleIcons.Designernews: ImageVector
    get() {
        if (_designernews != null) {
            return _designernews!!
        }
        _designernews = Builder(name = "Designernews", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.27f, 11.98f)
                curveToRelative(0.0f, -3.83f, -2.354f, -6.43f, -6.84f, -6.43f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(12.9f)
                horizontalLineToRelative(4.524f)
                curveToRelative(4.354f, 0.0f, 6.747f, -2.624f, 6.747f, -6.464f)
                verticalLineToRelative(-0.005f)
                close()
                moveTo(8.056f, 12.0f)
                curveToRelative(0.0f, 2.766f, -1.42f, 3.963f, -3.7f, 3.963f)
                horizontalLineToRelative(-1.16f)
                verticalLineTo(8.037f)
                horizontalLineToRelative(1.16f)
                curveToRelative(2.185f, 0.0f, 3.7f, 1.252f, 3.7f, 3.963f)
                close()
                moveTo(24.0f, 18.45f)
                verticalLineTo(5.55f)
                horizontalLineToRelative(-2.97f)
                verticalLineToRelative(7.213f)
                lineTo(16.28f, 5.55f)
                horizontalLineToRelative(-3.105f)
                verticalLineToRelative(12.9f)
                horizontalLineToRelative(2.973f)
                verticalLineToRelative(-7.723f)
                lineToRelative(5.084f, 7.718f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(0.004f)
                close()
            }
        }
        .build()
        return _designernews!!
    }

private var _designernews: ImageVector? = null
