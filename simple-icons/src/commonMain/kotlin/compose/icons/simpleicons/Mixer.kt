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

public val SimpleIcons.Mixer: VectorAsset
    get() {
        if (_mixer != null) {
            return _mixer!!
        }
        _mixer = VectorAssetBuilder(name = "Mixer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.456f, 1.375f)
                arcToRelative(2.461f, 2.461f, 0.0f, false, false, -1.65f, 0.642f)
                curveTo(-0.134f, 2.884f, -0.21f, 4.348f, 0.553f, 5.38f)
                lineToRelative(4.917f, 6.59f)
                lineToRelative(-4.946f, 6.65f)
                curveToRelative(-0.762f, 1.032f, -0.702f, 2.496f, 0.254f, 3.363f)
                arcToRelative(2.45f, 2.45f, 0.0f, false, false, 3.617f, -0.344f)
                lineToRelative(6.904f, -9.28f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.0f, -0.763f)
                lineTo(4.423f, 2.361f)
                arcToRelative(2.432f, 2.432f, 0.0f, false, false, -1.967f, -0.986f)
                close()
                moveTo(21.545f, 1.375f)
                arcToRelative(2.432f, 2.432f, 0.0f, false, false, -1.968f, 0.986f)
                lineToRelative(-6.86f, 9.22f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.0f, 0.762f)
                lineToRelative(6.89f, 9.296f)
                arcToRelative(2.45f, 2.45f, 0.0f, false, false, 3.617f, 0.344f)
                curveToRelative(0.956f, -0.867f, 1.016f, -2.331f, 0.254f, -3.363f)
                lineToRelative(-4.947f, -6.65f)
                lineToRelative(4.917f, -6.59f)
                curveToRelative(0.762f, -1.032f, 0.687f, -2.496f, -0.254f, -3.363f)
                arcToRelative(2.459f, 2.459f, 0.0f, false, false, -1.65f, -0.641f)
                close()
            }
        }
        .build()
        return _mixer!!
    }

private var _mixer: VectorAsset? = null
