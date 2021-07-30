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

public val SimpleIcons.Alibabacloud: ImageVector
    get() {
        if (_alibabacloud != null) {
            return _alibabacloud!!
        }
        _alibabacloud = Builder(name = "Alibabacloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.996f, 4.517f)
                horizontalLineToRelative(5.291f)
                lineTo(8.01f, 6.324f)
                lineTo(4.153f, 7.506f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, false, -1.165f, 1.601f)
                verticalLineToRelative(5.786f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, false, 1.165f, 1.6f)
                lineToRelative(3.857f, 1.183f)
                lineToRelative(1.277f, 1.807f)
                horizontalLineTo(3.996f)
                arcTo(3.996f, 3.996f, 0.0f, false, true, 0.0f, 15.487f)
                verticalLineTo(8.513f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, true, 3.996f, -3.996f)
                moveToRelative(16.008f, 0.0f)
                horizontalLineToRelative(-5.291f)
                lineToRelative(1.277f, 1.807f)
                lineToRelative(3.857f, 1.182f)
                curveToRelative(0.715f, 0.227f, 1.17f, 0.889f, 1.165f, 1.601f)
                verticalLineToRelative(5.786f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, true, -1.165f, 1.6f)
                lineToRelative(-3.857f, 1.183f)
                lineToRelative(-1.277f, 1.807f)
                horizontalLineToRelative(5.291f)
                arcTo(3.996f, 3.996f, 0.0f, false, false, 24.0f, 15.487f)
                verticalLineTo(8.513f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, false, -3.996f, -3.996f)
                moveToRelative(-4.007f, 8.345f)
                horizontalLineTo(8.002f)
                verticalLineToRelative(-1.804f)
                horizontalLineToRelative(7.995f)
                close()
            }
        }
        .build()
        return _alibabacloud!!
    }

private var _alibabacloud: ImageVector? = null
