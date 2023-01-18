package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CommentMultiple: ImageVector
    get() {
        if (_commentMultiple != null) {
            return _commentMultiple!!
        }
        _commentMultiple = Builder(name = "CommentMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0088f, 5.0088f)
                curveTo(5.1322f, 3.3265f, 6.5362f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(17.25f)
                curveTo(19.8734f, 2.0f, 22.0f, 4.1266f, 22.0f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(22.0f, 14.4638f, 20.6735f, 15.8678f, 18.9912f, 15.9912f)
                curveTo(18.8678f, 17.6735f, 17.4638f, 19.0f, 15.75f, 19.0f)
                horizontalLineTo(10.6667f)
                lineTo(7.0f, 21.75f)
                curveTo(6.176f, 22.368f, 5.0f, 21.7801f, 5.0f, 20.75f)
                verticalLineTo(18.9905f)
                curveTo(3.3219f, 18.8629f, 2.0f, 17.4608f, 2.0f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(2.0f, 6.5362f, 3.3265f, 5.1322f, 5.0088f, 5.0088f)
                close()
                moveTo(6.5177f, 5.0f)
                horizontalLineTo(15.75f)
                curveTo(17.5449f, 5.0f, 19.0f, 6.4551f, 19.0f, 8.25f)
                verticalLineTo(14.4823f)
                curveTo(19.8481f, 14.361f, 20.5f, 13.6316f, 20.5f, 12.75f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 4.9551f, 19.0449f, 3.5f, 17.25f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.3684f, 3.5f, 6.639f, 4.1519f, 6.5177f, 5.0f)
                close()
                moveTo(5.25f, 17.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(20.25f)
                lineTo(10.1667f, 17.5f)
                horizontalLineTo(15.75f)
                curveTo(16.7165f, 17.5f, 17.5f, 16.7165f, 17.5f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(17.5f, 7.2835f, 16.7165f, 6.5f, 15.75f, 6.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 6.5f, 3.5f, 7.2835f, 3.5f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 16.7165f, 4.2835f, 17.5f, 5.25f, 17.5f)
                close()
            }
        }
        .build()
        return _commentMultiple!!
    }

private var _commentMultiple: ImageVector? = null
