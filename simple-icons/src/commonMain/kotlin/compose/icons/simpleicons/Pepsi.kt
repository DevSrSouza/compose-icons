package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Pepsi: ImageVector
    get() {
        if (_pepsi != null) {
            return _pepsi!!
        }
        _pepsi = Builder(name = "Pepsi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.43f, 3.277f)
                arcTo(10.839f, 10.839f, 0.0f, false, false, 2.718f, 17.594f)
                curveToRelative(7.455f, -2.033f, 13.503f, -7.0f, 15.712f, -14.317f)
                moveTo(12.0f, 22.84f)
                arcToRelative(10.839f, 10.839f, 0.0f, false, false, 9.21f, -16.574f)
                arcToRelative(7.607f, 7.607f, 0.0f, false, true, -2.873f, 8.195f)
                curveToRelative(-3.285f, 2.416f, -8.06f, 2.432f, -14.649f, 4.494f)
                arcTo(10.817f, 10.817f, 0.0f, false, false, 12.0f, 22.84f)
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
            }
        }
        .build()
        return _pepsi!!
    }

private var _pepsi: ImageVector? = null
