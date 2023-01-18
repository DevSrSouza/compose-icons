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

public val FilledGroup.BoardHeart: ImageVector
    get() {
        if (_boardHeart != null) {
            return _boardHeart!!
        }
        _boardHeart = Builder(name = "BoardHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 21.001f)
                lineTo(11.4998f, 19.0703f)
                lineTo(11.304f, 18.8676f)
                curveTo(9.5653f, 17.068f, 9.5653f, 14.1639f, 11.304f, 12.3643f)
                curveTo(11.3677f, 12.2984f, 11.4328f, 12.2349f, 11.4992f, 12.1738f)
                lineTo(11.499f, 9.4991f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.7518f)
                lineTo(3.0051f, 17.9362f)
                curveTo(3.1008f, 19.6454f, 4.517f, 21.0017f, 6.2501f, 21.0017f)
                lineTo(11.5f, 21.001f)
                close()
                moveTo(21.5014f, 5.748f)
                lineTo(21.5004f, 11.4778f)
                curveTo(20.0718f, 10.7513f, 18.3449f, 10.8533f, 17.0f, 11.7837f)
                curveTo(15.8085f, 10.9594f, 14.3173f, 10.7854f, 12.9992f, 11.2615f)
                lineTo(13.0f, 2.498f)
                horizontalLineTo(18.2514f)
                curveTo(19.9844f, 2.498f, 21.4007f, 3.8544f, 21.4963f, 5.5635f)
                lineTo(21.5014f, 5.748f)
                close()
                moveTo(11.4997f, 17.4812f)
                curveTo(10.8335f, 16.3377f, 10.8334f, 14.8949f, 11.4994f, 13.7513f)
                curveTo(11.643f, 13.5046f, 11.8176f, 13.2719f, 12.0232f, 13.0591f)
                curveTo(12.3152f, 12.7568f, 12.6461f, 12.5193f, 12.9991f, 12.3464f)
                curveTo(14.2127f, 11.7522f, 15.6888f, 11.9224f, 16.752f, 12.8571f)
                curveTo(16.8246f, 12.9208f, 16.8952f, 12.9882f, 16.9637f, 13.0591f)
                lineTo(17.0f, 13.0966f)
                lineTo(17.0363f, 13.0591f)
                curveTo(17.1048f, 12.9882f, 17.1754f, 12.9208f, 17.248f, 12.8571f)
                curveTo(18.4623f, 11.7897f, 20.2149f, 11.7193f, 21.5002f, 12.6459f)
                curveTo(21.6678f, 12.7667f, 21.8274f, 12.9044f, 21.9768f, 13.0591f)
                curveTo(23.3411f, 14.4712f, 23.3411f, 16.7607f, 21.9768f, 18.1728f)
                lineTo(17.5345f, 22.7709f)
                curveTo(17.3869f, 22.9236f, 17.1935f, 23.0f, 17.0f, 23.0f)
                curveTo(16.8065f, 23.0f, 16.6131f, 22.9236f, 16.4655f, 22.7709f)
                lineTo(12.0232f, 18.1728f)
                curveTo(11.8178f, 17.9602f, 11.6433f, 17.7276f, 11.4997f, 17.4812f)
                close()
                moveTo(11.499f, 7.9991f)
                lineTo(11.5f, 2.498f)
                horizontalLineTo(6.2506f)
                curveTo(4.4558f, 2.498f, 3.0008f, 3.9532f, 3.0006f, 5.748f)
                lineTo(3.0f, 7.9991f)
                horizontalLineTo(11.499f)
                close()
            }
        }
        .build()
        return _boardHeart!!
    }

private var _boardHeart: ImageVector? = null
