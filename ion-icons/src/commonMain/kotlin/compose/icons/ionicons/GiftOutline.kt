package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.GiftOutline: ImageVector
    get() {
        if (_giftOutline != null) {
            return _giftOutline!!
        }
        _giftOutline = Builder(name = "GiftOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 104.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -56.0f, -56.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 104.0f)
                curveToRelative(0.0f, 15.46f, 0.0f, 56.0f, 0.0f, 56.0f)
                horizontalLineTo(200.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 160.0f)
                lineTo(416.0f, 160.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 448.0f, 192.0f)
                lineTo(448.0f, 240.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 416.0f, 272.0f)
                lineTo(96.0f, 272.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 240.0f)
                lineTo(64.0f, 192.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 272.0f)
                verticalLineTo(416.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                horizontalLineTo(144.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                verticalLineTo(272.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 160.0f)
                lineTo(256.0f, 464.0f)
            }
        }
        .build()
        return _giftOutline!!
    }

private var _giftOutline: ImageVector? = null
