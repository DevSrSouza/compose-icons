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

public val SimpleIcons.Clyp: VectorAsset
    get() {
        if (_clyp != null) {
            return _clyp!!
        }
        _clyp = VectorAssetBuilder(name = "Clyp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.958f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.138f, -1.136f)
                verticalLineTo(7.233f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(9.59f)
                curveToRelative(0.0f, 0.627f, -0.51f, 1.135f, -1.138f, 1.135f)
                moveToRelative(7.439f, 2.44f)
                arcTo(1.137f, 1.137f, 0.0f, false, true, 18.3f, 19.26f)
                verticalLineTo(4.794f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(14.467f)
                curveToRelative(0.0f, 0.627f, -0.51f, 1.136f, -1.138f, 1.136f)
                moveTo(15.719f, 24.0f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.138f, -1.136f)
                verticalLineTo(1.136f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(21.728f)
                curveToRelative(0.0f, 0.627f, -0.509f, 1.136f, -1.138f, 1.136f)
                moveToRelative(-7.438f, -3.16f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.138f, -1.136f)
                verticalLineTo(4.296f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(15.408f)
                curveToRelative(0.0f, 0.628f, -0.51f, 1.137f, -1.138f, 1.137f)
                moveToRelative(-3.72f, -4.989f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, -1.138f, -1.136f)
                verticalLineTo(9.284f)
                arcToRelative(1.137f, 1.137f, 0.0f, false, true, 2.276f, 0.0f)
                verticalLineToRelative(5.432f)
                curveToRelative(0.0f, 0.627f, -0.51f, 1.136f, -1.138f, 1.136f)
                close()
            }
        }
        .build()
        return _clyp!!
    }

private var _clyp: VectorAsset? = null
