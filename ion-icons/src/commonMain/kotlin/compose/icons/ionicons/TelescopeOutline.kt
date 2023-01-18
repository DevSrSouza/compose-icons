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

public val IonIcons.TelescopeOutline: ImageVector
    get() {
        if (_telescopeOutline != null) {
            return _telescopeOutline!!
        }
        _telescopeOutline = Builder(name = "TelescopeOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(39.93f, 327.56f)
                lineToRelative(-4.71f, -8.13f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 44.0f, 286.64f)
                lineToRelative(86.87f, -50.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.89f, 5.86f)
                lineToRelative(12.71f, 22.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -5.86f, 21.85f)
                lineTo(72.76f, 336.35f)
                arcTo(24.06f, 24.06f, 0.0f, false, true, 39.93f, 327.56f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(170.68f, 273.72f)
                lineTo(147.12f, 233.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 8.8f, -32.78f)
                lineToRelative(124.46f, -71.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.89f, 5.86f)
                lineToRelative(31.57f, 54.59f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 328.0f, 210.76f)
                lineTo(203.51f, 282.5f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 170.68f, 273.72f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(341.85f, 202.21f)
                lineToRelative(-46.51f, -80.43f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 304.14f, 89.0f)
                lineToRelative(93.29f, -53.78f)
                arcTo(24.07f, 24.07f, 0.0f, false, true, 430.27f, 44.0f)
                lineToRelative(46.51f, 80.43f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -8.8f, 32.79f)
                lineTo(374.69f, 211.0f)
                arcTo(24.06f, 24.06f, 0.0f, false, true, 341.85f, 202.21f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(127.59f, 480.0f)
                lineTo(223.73f, 272.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(271.8f, 256.02f)
                lineTo(368.55f, 448.0f)
            }
        }
        .build()
        return _telescopeOutline!!
    }

private var _telescopeOutline: ImageVector? = null
