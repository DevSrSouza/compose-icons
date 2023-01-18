package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CommentMultiple: ImageVector
    get() {
        if (_commentMultiple != null) {
            return _commentMultiple!!
        }
        _commentMultiple = Builder(name = "CommentMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 2.0f)
                curveTo(6.5369f, 2.0f, 5.1334f, 3.3254f, 5.009f, 5.0067f)
                curveTo(5.0887f, 5.0023f, 5.1691f, 5.0f, 5.25f, 5.0f)
                horizontalLineTo(14.75f)
                curveTo(17.0972f, 5.0f, 19.0f, 6.9028f, 19.0f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(19.0f, 15.8309f, 18.9977f, 15.9113f, 18.9933f, 15.991f)
                curveTo(20.6746f, 15.8666f, 22.0f, 14.4631f, 22.0f, 12.75f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 4.1266f, 19.8734f, 2.0f, 17.25f, 2.0f)
                horizontalLineTo(8.25f)
                close()
                moveTo(17.9905f, 16.0f)
                curveTo(17.8629f, 17.6781f, 16.4608f, 19.0f, 14.75f, 19.0f)
                horizontalLineTo(10.6667f)
                lineTo(7.0f, 21.75f)
                curveTo(6.176f, 22.368f, 5.0f, 21.7801f, 5.0f, 20.75f)
                verticalLineTo(18.9905f)
                curveTo(3.3219f, 18.8629f, 2.0f, 17.4608f, 2.0f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(2.0f, 7.5392f, 3.3219f, 6.1371f, 5.0f, 6.0095f)
                curveTo(5.0825f, 6.0032f, 5.1659f, 6.0f, 5.25f, 6.0f)
                horizontalLineTo(14.75f)
                curveTo(16.5449f, 6.0f, 18.0f, 7.4551f, 18.0f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(18.0f, 15.8341f, 17.9968f, 15.9175f, 17.9905f, 16.0f)
                close()
            }
        }
        .build()
        return _commentMultiple!!
    }

private var _commentMultiple: ImageVector? = null
