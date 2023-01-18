package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AdvertisementLine: ImageVector
    get() {
        if (_advertisementLine != null) {
            return _advertisementLine!!
        }
        _advertisementLine = Builder(name = "AdvertisementLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(9.399f, 8.0f)
                lineToRelative(3.199f, 8.0f)
                horizontalLineToRelative(-2.155f)
                lineToRelative(-0.4f, -1.0f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(-0.4f, 1.0f)
                lineTo(4.199f, 16.0f)
                lineToRelative(3.2f, -8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                horizontalLineToRelative(0.999f)
                lineTo(17.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.399f, 10.885f)
                lineTo(7.552f, 13.0f)
                horizontalLineToRelative(1.692f)
                lineToRelative(-0.845f, -2.115f)
                close()
            }
        }
        .build()
        return _advertisementLine!!
    }

private var _advertisementLine: ImageVector? = null
