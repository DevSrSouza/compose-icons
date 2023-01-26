package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.VideoCameraBack: ImageVector
    get() {
        if (_videoCameraBack != null) {
            return _videoCameraBack!!
        }
        _videoCameraBack = Builder(name = "VideoCameraBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.48f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-6.48f)
                lineToRelative(4.0f, 3.98f)
                verticalLineToRelative(-11.0f)
                lineTo(18.0f, 10.48f)
                close()
                moveTo(5.0f, 16.0f)
                lineToRelative(2.38f, -3.17f)
                lineTo(9.0f, 15.0f)
                lineToRelative(2.62f, -3.5f)
                lineTo(15.0f, 16.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _videoCameraBack!!
    }

private var _videoCameraBack: ImageVector? = null
