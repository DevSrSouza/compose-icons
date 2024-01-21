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

public val SimpleIcons.Warp: ImageVector
    get() {
        if (_warp != null) {
            return _warp!!
        }
        _warp = Builder(name = "Warp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.035f, 2.723f)
                horizontalLineToRelative(9.253f)
                arcTo(2.712f, 2.712f, 0.0f, false, true, 24.0f, 5.435f)
                verticalLineToRelative(10.529f)
                arcToRelative(2.712f, 2.712f, 0.0f, false, true, -2.712f, 2.713f)
                lineTo(8.047f, 18.677f)
                close()
                moveTo(10.354f, 5.323f)
                lineTo(6.766f, 19.677f)
                horizontalLineToRelative(5.598f)
                lineToRelative(-0.399f, 1.6f)
                lineTo(2.712f, 21.277f)
                arcTo(2.712f, 2.712f, 0.0f, false, true, 0.0f, 18.565f)
                lineTo(0.0f, 8.036f)
                arcToRelative(2.712f, 2.712f, 0.0f, false, true, 2.712f, -2.712f)
                close()
            }
        }
        .build()
        return _warp!!
    }

private var _warp: ImageVector? = null
