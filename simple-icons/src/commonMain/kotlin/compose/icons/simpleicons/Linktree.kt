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

public val SimpleIcons.Linktree: VectorAsset
    get() {
        if (_linktree != null) {
            return _linktree!!
        }
        _linktree = VectorAssetBuilder(name = "Linktree", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.953f, 15.066f)
                curveToRelative(-0.08f, 0.163f, -0.08f, 0.324f, -0.08f, 0.486f)
                curveToRelative(0.08f, 0.517f, 0.528f, 0.897f, 1.052f, 0.89f)
                horizontalLineToRelative(1.294f)
                verticalLineToRelative(4.776f)
                curveToRelative(0.0f, 0.486f, -0.404f, 0.89f, -0.89f, 0.89f)
                lineTo(6.577f, 22.108f)
                arcToRelative(0.898f, 0.898f, 0.0f, false, true, -0.889f, -0.891f)
                verticalLineToRelative(-4.774f)
                lineTo(0.992f, 16.443f)
                curveToRelative(-0.728f, 0.0f, -1.214f, -0.729f, -0.89f, -1.377f)
                lineToRelative(6.96f, -12.627f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, true, 1.863f, 0.0f)
                lineToRelative(2.913f, 5.585f)
                lineToRelative(-3.885f, 7.042f)
                close()
                moveTo(23.898f, 15.066f)
                lineToRelative(-6.96f, -12.627f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, false, -1.862f, 0.0f)
                lineToRelative(-2.995f, 5.586f)
                lineToRelative(3.885f, 7.04f)
                curveToRelative(0.081f, 0.164f, 0.081f, 0.326f, 0.081f, 0.487f)
                curveToRelative(-0.08f, 0.517f, -0.529f, 0.897f, -1.052f, 0.89f)
                horizontalLineToRelative(-1.296f)
                verticalLineToRelative(4.776f)
                curveToRelative(0.005f, 0.49f, 0.4f, 0.887f, 0.89f, 0.89f)
                horizontalLineToRelative(2.914f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.892f, -0.89f)
                verticalLineToRelative(-4.775f)
                horizontalLineToRelative(4.612f)
                curveToRelative(0.73f, 0.0f, 1.214f, -0.729f, 0.89f, -1.377f)
                close()
            }
        }
        .build()
        return _linktree!!
    }

private var _linktree: VectorAsset? = null
