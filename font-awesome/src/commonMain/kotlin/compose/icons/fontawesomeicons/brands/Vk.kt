package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Vk: ImageVector
    get() {
        if (_vk != null) {
            return _vk!!
        }
        _vk = Builder(name = "Vk", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.491f, 63.491f)
                curveTo(0.0f, 94.981f, 0.0f, 145.671f, 0.0f, 247.04f)
                verticalLineTo(264.96f)
                curveTo(0.0f, 366.329f, 0.0f, 417.019f, 31.491f, 448.509f)
                curveTo(62.981f, 480.0f, 113.671f, 480.0f, 215.04f, 480.0f)
                horizontalLineTo(232.96f)
                curveTo(334.329f, 480.0f, 385.019f, 480.0f, 416.509f, 448.509f)
                curveTo(448.0f, 417.019f, 448.0f, 366.329f, 448.0f, 264.96f)
                verticalLineTo(247.04f)
                curveTo(448.0f, 145.671f, 448.0f, 94.981f, 416.509f, 63.491f)
                curveTo(385.019f, 32.0f, 334.329f, 32.0f, 232.96f, 32.0f)
                horizontalLineTo(215.04f)
                curveTo(113.671f, 32.0f, 62.981f, 32.0f, 31.491f, 63.491f)
                close()
                moveTo(75.6f, 168.267f)
                horizontalLineTo(126.747f)
                curveTo(128.427f, 253.76f, 166.133f, 289.973f, 196.0f, 297.44f)
                verticalLineTo(168.267f)
                horizontalLineTo(244.16f)
                verticalLineTo(242.0f)
                curveTo(273.653f, 238.827f, 304.64f, 205.227f, 315.093f, 168.267f)
                horizontalLineTo(363.253f)
                curveTo(359.313f, 187.435f, 351.46f, 205.583f, 340.186f, 221.579f)
                curveTo(328.913f, 237.574f, 314.461f, 251.071f, 297.733f, 261.227f)
                curveTo(316.41f, 270.499f, 332.907f, 283.63f, 346.132f, 299.751f)
                curveTo(359.357f, 315.873f, 369.01f, 334.618f, 374.453f, 354.747f)
                horizontalLineTo(321.44f)
                curveTo(316.555f, 337.262f, 306.614f, 321.61f, 292.865f, 309.754f)
                curveTo(279.117f, 297.899f, 262.173f, 290.368f, 244.16f, 288.107f)
                verticalLineTo(354.747f)
                horizontalLineTo(238.373f)
                curveTo(136.267f, 354.747f, 78.027f, 284.747f, 75.6f, 168.267f)
                close()
            }
        }
        .build()
        return _vk!!
    }

private var _vk: ImageVector? = null
