package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Sun24: ImageVector
    get() {
        if (_sun24 != null) {
            return _sun24!!
        }
        _sun24 = Builder(name = "Sun24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.0f, -14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                close()
                moveTo(6.343f, 17.657f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-1.768f, 1.768f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.275f, -0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.215f, -0.734f)
                lineToRelative(1.767f, -1.768f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 0.0f)
                close()
                moveTo(3.515f, 3.515f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(1.768f, 1.768f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineTo(3.515f, 4.575f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.25f, 0.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                lineTo(0.75f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(17.657f, 17.657f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(1.768f, 1.768f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, 1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, 0.018f)
                lineToRelative(-1.768f, -1.767f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.061f)
                close()
                moveTo(20.485f, 3.515f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-1.768f, 1.768f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, -0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, -1.042f)
                lineToRelative(1.767f, -1.768f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 0.0f)
                close()
            }
        }
        .build()
        return _sun24!!
    }

private var _sun24: ImageVector? = null
