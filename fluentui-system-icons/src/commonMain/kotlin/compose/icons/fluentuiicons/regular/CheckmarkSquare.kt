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

public val RegularGroup.CheckmarkSquare: ImageVector
    get() {
        if (_checkmarkSquare != null) {
            return _checkmarkSquare!!
        }
        _checkmarkSquare = Builder(name = "CheckmarkSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2802f, 9.7803f)
                curveTo(16.5731f, 9.4875f, 16.5731f, 9.0126f, 16.2802f, 8.7197f)
                curveTo(15.9873f, 8.4268f, 15.5125f, 8.4268f, 15.2196f, 8.7197f)
                lineTo(10.7499f, 13.1891f)
                lineTo(9.2764f, 11.7157f)
                curveTo(8.9835f, 11.4228f, 8.5086f, 11.4228f, 8.2158f, 11.7157f)
                curveTo(7.9229f, 12.0085f, 7.9229f, 12.4834f, 8.2158f, 12.7763f)
                lineTo(10.2196f, 14.7801f)
                curveTo(10.5124f, 15.073f, 10.9873f, 15.073f, 11.2802f, 14.7801f)
                lineTo(16.2802f, 9.7803f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _checkmarkSquare!!
    }

private var _checkmarkSquare: ImageVector? = null
