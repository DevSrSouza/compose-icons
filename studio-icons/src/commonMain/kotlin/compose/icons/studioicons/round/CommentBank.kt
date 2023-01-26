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

public val RoundGroup.CommentBank: ImageVector
    get() {
        if (_commentBank != null) {
            return _commentBank!!
        }
        _commentBank = Builder(name = "CommentBank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineToRelative(15.59f)
                curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
                moveTo(18.24f, 11.55f)
                lineTo(16.5f, 10.5f)
                lineToRelative(-1.74f, 1.05f)
                curveToRelative(-0.33f, 0.2f, -0.76f, -0.04f, -0.76f, -0.43f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.12f)
                curveTo(19.0f, 11.51f, 18.58f, 11.75f, 18.24f, 11.55f)
                close()
            }
        }
        .build()
        return _commentBank!!
    }

private var _commentBank: ImageVector? = null
