package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tui: VectorAsset
    get() {
        if (_tui != null) {
            return _tui!!
        }
        _tui = VectorAssetBuilder(name = "Tui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.5167f)
                arcTo(2.117f, 2.117f, 0.0f, false, true, 21.883f, 6.6337f)
                arcTo(2.117f, 2.117f, 0.0f, false, true, 19.766f, 4.5167f)
                arcTo(2.117f, 2.117f, 0.0f, false, true, 21.883f, 2.3998f)
                arcTo(2.117f, 2.117f, 0.0f, false, true, 24.0f, 4.5167f)
                close()
                moveTo(1.1397f, 7.7475f)
                horizontalLineTo(6.8452f)
                curveTo(7.4094f, 7.7475f, 7.8258f, 7.9247f, 7.9917f, 8.7191f)
                curveTo(8.1768f, 9.6027f, 8.1046f, 10.2177f, 7.1059f, 10.2877f)
                lineTo(5.315f, 10.4197f)
                curveTo(6.6331f, 18.75f, 14.3427f, 21.465f, 18.5371f, 12.4927f)
                curveTo(19.2323f, 11.0076f, 19.4591f, 10.7379f, 20.2197f, 10.9264f)
                curveTo(21.2511f, 11.1825f, 21.3921f, 11.7163f, 20.8967f, 13.2092f)
                curveTo(17.2733f, 24.2658f, 5.0781f, 25.3751f, 2.6857f, 10.6048f)
                lineTo(1.2311f, 10.7097f)
                curveTo(0.0463f, 10.7943f, 0.0f, 9.7957f, 0.0f, 9.2405f)
                curveTo(0.0f, 8.1413f, 0.4074f, 7.7475f, 1.1397f, 7.7475f)
                close()
            }
        }
        .build()
        return _tui!!
    }

private var _tui: VectorAsset? = null
