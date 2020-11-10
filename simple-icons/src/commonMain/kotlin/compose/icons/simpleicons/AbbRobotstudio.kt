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

public val SimpleIcons.AbbRobotstudio: VectorAsset
    get() {
        if (_abbRobotstudio != null) {
            return _abbRobotstudio!!
        }
        _abbRobotstudio = VectorAssetBuilder(name = "AbbRobotstudio", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.46f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, -19.2f, 0.0f)
                horizontalLineToRelative(1.07f)
                arcToRelative(8.53f, 8.53f, 0.0f, true, false, 8.53f, -8.53f)
                lineTo(14.4f, 2.86f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, 9.6f, 9.6f)
                close()
                moveTo(14.4f, 9.26f)
                arcToRelative(3.2f, 3.2f, 0.0f, true, false, 3.2f, 3.2f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -3.2f, -3.2f)
                close()
                moveTo(12.4f, 9.26f)
                lineToRelative(-0.6f, -6.67f)
                lineToRelative(-2.46f, 1.92f)
                lineToRelative(-1.46f, -1.44f)
                arcToRelative(4.67f, 4.67f, 0.0f, false, false, -5.62f, -0.37f)
                lineTo(0.24f, 4.0f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.15f, 0.74f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.74f, 0.15f)
                lineToRelative(2.0f, -1.31f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, true, 4.29f, 0.22f)
                lineToRelative(1.37f, 1.38f)
                lineTo(6.2f, 7.0f)
                close()
            }
        }
        .build()
        return _abbRobotstudio!!
    }

private var _abbRobotstudio: VectorAsset? = null
