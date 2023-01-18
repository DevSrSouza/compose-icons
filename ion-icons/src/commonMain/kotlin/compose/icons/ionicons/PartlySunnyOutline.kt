package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PartlySunnyOutline: ImageVector
    get() {
        if (_partlySunnyOutline != null) {
            return _partlySunnyOutline!!
        }
        _partlySunnyOutline = Builder(name = "PartlySunnyOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(90.61f, 306.85f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 104.0f, 293.6f)
                curveTo(116.09f, 220.17f, 169.63f, 176.0f, 232.0f, 176.0f)
                curveToRelative(57.93f, 0.0f, 96.62f, 37.75f, 112.2f, 77.74f)
                arcToRelative(15.84f, 15.84f, 0.0f, false, false, 12.2f, 9.87f)
                curveToRelative(50.0f, 8.15f, 91.6f, 41.54f, 91.6f, 99.59f)
                curveTo(448.0f, 422.6f, 399.4f, 464.0f, 340.0f, 464.0f)
                horizontalLineTo(106.0f)
                curveToRelative(-49.5f, 0.0f, -90.0f, -24.7f, -90.0f, -79.2f)
                curveTo(16.0f, 336.33f, 54.67f, 312.58f, 90.61f, 306.85f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.8f, 271.4f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -123.55f, -92.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 208.0f)
                lineTo(496.0f, 208.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 48.0f)
                lineTo(336.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(222.86f, 94.86f)
                lineTo(245.49f, 117.49f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(449.14f, 94.86f)
                lineTo(426.51f, 117.49f)
            }
        }
        .build()
        return _partlySunnyOutline!!
    }

private var _partlySunnyOutline: ImageVector? = null
