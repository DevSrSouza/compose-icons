package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.DiamondOutline: ImageVector
    get() {
        if (_diamondOutline != null) {
            return _diamondOutline!!
        }
        _diamondOutline = Builder(name = "DiamondOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(35.42f, 188.21f)
                lineTo(243.17f, 457.67f)
                arcToRelative(16.17f, 16.17f, 0.0f, false, false, 25.66f, 0.0f)
                lineTo(476.58f, 188.21f)
                arcToRelative(16.52f, 16.52f, 0.0f, false, false, 0.95f, -18.75f)
                lineTo(407.06f, 55.71f)
                arcTo(16.22f, 16.22f, 0.0f, false, false, 393.27f, 48.0f)
                horizontalLineTo(118.73f)
                arcToRelative(16.22f, 16.22f, 0.0f, false, false, -13.79f, 7.71f)
                lineTo(34.47f, 169.46f)
                arcTo(16.52f, 16.52f, 0.0f, false, false, 35.42f, 188.21f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 176.0f)
                lineTo(464.0f, 176.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 64.0f)
                lineToRelative(-48.0f, 112.0f)
                lineToRelative(-96.0f, -128.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 64.0f)
                lineToRelative(48.0f, 112.0f)
                lineToRelative(96.0f, -128.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                lineTo(160.0f, 176.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                lineTo(352.0f, 176.0f)
            }
        }
        .build()
        return _diamondOutline!!
    }

private var _diamondOutline: ImageVector? = null
