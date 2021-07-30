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

public val SimpleIcons.Openbadges: ImageVector
    get() {
        if (_openbadges != null) {
            return _openbadges!!
        }
        _openbadges = Builder(name = "Openbadges", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.43f, 18.584f)
                lineToRelative(-8.265f, -4.749f)
                lineToRelative(1.078f, -0.641f)
                lineToRelative(0.719f, -0.411f)
                lineToRelative(0.719f, 0.41f)
                lineToRelative(1.796f, 1.027f)
                lineToRelative(1.437f, 0.821f)
                lineToRelative(1.797f, 1.027f)
                lineToRelative(1.438f, 0.822f)
                lineToRelative(1.078f, 0.616f)
                close()
                moveTo(15.196f, 20.457f)
                lineToRelative(-8.24f, -4.774f)
                lineToRelative(1.797f, -1.027f)
                lineToRelative(8.24f, 4.75f)
                lineToRelative(-1.797f, 1.051f)
                close()
                moveTo(11.987f, 22.305f)
                lineToRelative(-8.24f, -4.748f)
                lineToRelative(1.797f, -1.027f)
                lineToRelative(8.24f, 4.749f)
                close()
                moveTo(3.03f, 14.246f)
                lineToRelative(8.24f, -4.748f)
                verticalLineToRelative(2.079f)
                lineToRelative(-0.719f, 0.41f)
                lineToRelative(-1.797f, 1.027f)
                lineToRelative(-1.438f, 0.821f)
                lineToRelative(-1.796f, 1.027f)
                lineToRelative(-1.437f, 0.822f)
                lineToRelative(-1.053f, 0.615f)
                verticalLineToRelative(-2.054f)
                close()
                moveTo(3.03f, 10.524f)
                lineToRelative(8.24f, -4.749f)
                verticalLineToRelative(2.08f)
                lineToRelative(-8.24f, 4.723f)
                verticalLineToRelative(-2.054f)
                close()
                moveTo(3.03f, 6.802f)
                lineToRelative(8.24f, -4.749f)
                verticalLineToRelative(2.054f)
                lineTo(3.03f, 8.856f)
                lineTo(3.03f, 6.802f)
                close()
                moveTo(12.707f, 2.053f)
                lineToRelative(1.797f, 1.027f)
                verticalLineToRelative(9.523f)
                lineToRelative(-1.078f, -0.616f)
                lineToRelative(-0.719f, -0.41f)
                lineTo(12.707f, 2.052f)
                close()
                moveTo(15.916f, 3.901f)
                lineToRelative(1.796f, 1.027f)
                verticalLineToRelative(9.523f)
                lineToRelative(-1.797f, -1.027f)
                lineTo(15.915f, 3.901f)
                close()
                moveTo(19.15f, 5.776f)
                lineToRelative(1.796f, 1.026f)
                verticalLineToRelative(9.523f)
                lineToRelative(-1.796f, -1.027f)
                lineTo(19.15f, 5.775f)
                close()
                moveTo(22.41f, 5.981f)
                lineToRelative(-1.49f, -0.822f)
                lineToRelative(-1.796f, -1.026f)
                lineToRelative(-1.412f, -0.847f)
                lineToRelative(-1.797f, -1.027f)
                lineToRelative(-1.437f, -0.822f)
                lineTo(12.68f, 0.411f)
                lineTo(11.962f, 0.0f)
                lineToRelative(-0.719f, 0.411f)
                lineToRelative(-9.651f, 5.57f)
                verticalLineToRelative(12.012f)
                lineToRelative(0.718f, 0.41f)
                lineTo(11.987f, 24.0f)
                lineToRelative(1.438f, -0.822f)
                lineToRelative(1.797f, -1.026f)
                lineToRelative(1.437f, -0.821f)
                lineToRelative(1.797f, -1.027f)
                lineToRelative(1.437f, -0.821f)
                lineToRelative(1.797f, -1.027f)
                lineToRelative(0.718f, -0.411f)
                close()
            }
        }
        .build()
        return _openbadges!!
    }

private var _openbadges: ImageVector? = null
