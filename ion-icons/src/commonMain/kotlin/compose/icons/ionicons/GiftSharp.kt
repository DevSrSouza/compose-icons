package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.GiftSharp: ImageVector
    get() {
        if (_giftSharp != null) {
            return _giftSharp!!
        }
        _giftSharp = Builder(name = "GiftSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 144.0f)
                horizontalLineToRelative(44.0f)
                lineTo(278.0f, 256.0f)
                lineTo(442.0f, 256.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(464.0f, 166.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(382.18f, 144.0f)
                arcTo(77.95f, 77.95f, 0.0f, false, false, 256.0f, 55.79f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 129.81f, 144.0f)
                lineTo(70.0f, 144.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(234.0f, 256.0f)
                close()
                moveTo(278.0f, 110.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f)
                lineTo(278.0f, 144.0f)
                close()
                moveTo(166.0f, 110.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 68.0f, 0.0f)
                verticalLineToRelative(34.0f)
                lineTo(200.0f, 144.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 166.0f, 110.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(278.0f, 480.0f)
                horizontalLineTo(410.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineTo(288.0f)
                horizontalLineTo(278.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 458.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineTo(234.0f)
                verticalLineTo(288.0f)
                horizontalLineTo(80.0f)
                close()
            }
        }
        .build()
        return _giftSharp!!
    }

private var _giftSharp: ImageVector? = null
