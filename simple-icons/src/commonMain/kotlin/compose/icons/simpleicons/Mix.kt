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

public val SimpleIcons.Mix: VectorAsset
    get() {
        if (_mix != null) {
            return _mix!!
        }
        _mix = VectorAssetBuilder(name = "Mix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8f, 6.1f)
                verticalLineToRelative(15.15f)
                curveToRelative(0.0f, 1.35f, -1.05f, 2.35f, -2.4f, 2.35f)
                curveToRelative(-1.35f, 0.0f, -2.4f, -1.05f, -2.4f, -2.35f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(13.35f)
                curveToRelative(0.0f, 1.3f, -1.1f, 2.35f, -2.4f, 2.35f)
                curveToRelative(-1.35f, 0.0f, -2.45f, -1.05f, -2.45f, -2.35f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.0f, -1.35f, -1.05f, -2.35f, -2.4f, -2.35f)
                curveToRelative(-1.137f, 0.0f, -2.121f, 0.803f, -2.35f, 1.875f)
                verticalLineTo(15.5f)
                curveToRelative(0.0f, 1.35f, -1.1f, 2.35f, -2.4f, 2.35f)
                curveToRelative(-1.35f, 0.0f, -2.4f, -1.05f, -2.4f, -2.35f)
                verticalLineTo(6.25f)
                curveToRelative(0.0f, -1.3f, -1.1f, -2.35f, -2.4f, -2.35f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -2.4f, 2.2f)
                close()
            }
        }
        .build()
        return _mix!!
    }

private var _mix: VectorAsset? = null
