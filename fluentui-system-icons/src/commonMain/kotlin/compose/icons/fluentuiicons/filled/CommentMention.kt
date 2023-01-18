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

public val FilledGroup.CommentMention: ImageVector
    get() {
        if (_commentMention != null) {
            return _commentMention!!
        }
        _commentMention = Builder(name = "CommentMention", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9995f, 6.0f)
                curveTo(13.9995f, 3.7905f, 15.7906f, 1.9994f, 18.0f, 1.9994f)
                curveTo(20.2049f, 1.9994f, 21.9931f, 3.7831f, 22.0006f, 5.9861f)
                lineTo(22.0005f, 5.9946f)
                verticalLineTo(6.75f)
                curveTo(22.0005f, 7.1642f, 21.6647f, 7.5f, 21.2505f, 7.5f)
                curveTo(20.8363f, 7.5f, 20.5005f, 7.1642f, 20.5005f, 6.75f)
                verticalLineTo(4.0f)
                curveTo(20.5005f, 3.7239f, 20.2766f, 3.5f, 20.0005f, 3.5f)
                curveTo(19.7244f, 3.5f, 19.5006f, 3.7238f, 19.5005f, 3.9998f)
                curveTo(19.0827f, 3.686f, 18.5633f, 3.5f, 18.0005f, 3.5f)
                curveTo(16.6198f, 3.5f, 15.5005f, 4.6193f, 15.5005f, 6.0f)
                curveTo(15.5005f, 7.3807f, 16.6198f, 8.5f, 18.0005f, 8.5f)
                curveTo(18.7084f, 8.5f, 19.3476f, 8.2058f, 19.8024f, 7.7329f)
                curveTo(20.1173f, 8.1959f, 20.6484f, 8.5f, 21.2505f, 8.5f)
                curveTo(22.217f, 8.5f, 23.0005f, 7.7165f, 23.0005f, 6.75f)
                verticalLineTo(6.0098f)
                lineTo(23.0006f, 6.0f)
                curveTo(23.0006f, 3.2383f, 20.7618f, 0.9995f, 18.0f, 0.9995f)
                curveTo(15.2383f, 0.9995f, 12.9995f, 3.2383f, 12.9995f, 6.0f)
                curveTo(12.9995f, 8.7617f, 15.2383f, 11.0005f, 18.0f, 11.0005f)
                curveTo(19.0248f, 11.0005f, 19.9798f, 10.7003f, 20.7783f, 10.1654f)
                curveTo(21.0077f, 10.0117f, 21.0691f, 9.7011f, 20.9154f, 9.4717f)
                curveTo(20.7617f, 9.2423f, 20.4512f, 9.1809f, 20.2217f, 9.3346f)
                curveTo(19.5878f, 9.7593f, 18.8264f, 10.0005f, 18.0f, 10.0005f)
                curveTo(15.7906f, 10.0005f, 13.9995f, 8.2094f, 13.9995f, 6.0f)
                close()
                moveTo(18.0005f, 7.5f)
                curveTo(17.1721f, 7.5f, 16.5005f, 6.8284f, 16.5005f, 6.0f)
                curveTo(16.5005f, 5.1716f, 17.1721f, 4.5f, 18.0005f, 4.5f)
                curveTo(18.8289f, 4.5f, 19.5005f, 5.1716f, 19.5005f, 6.0f)
                curveTo(19.5005f, 6.8284f, 18.8289f, 7.5f, 18.0005f, 7.5f)
                close()
                moveTo(5.25f, 3.0f)
                horizontalLineTo(12.8027f)
                curveTo(12.2922f, 3.8825f, 12.0f, 4.9071f, 12.0f, 6.0f)
                curveTo(12.0f, 9.3137f, 14.6863f, 12.0f, 18.0f, 12.0f)
                curveTo(19.5367f, 12.0f, 20.9385f, 11.4223f, 22.0f, 10.4722f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 16.5449f, 20.5449f, 18.0f, 18.75f, 18.0f)
                horizontalLineTo(13.0f)
                lineTo(8.0f, 21.75f)
                curveTo(7.176f, 22.368f, 6.0f, 21.7801f, 6.0f, 20.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 18.0f, 2.0f, 16.5449f, 2.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                close()
            }
        }
        .build()
        return _commentMention!!
    }

private var _commentMention: ImageVector? = null
