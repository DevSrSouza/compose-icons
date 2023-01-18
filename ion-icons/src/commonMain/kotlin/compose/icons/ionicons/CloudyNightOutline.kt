package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CloudyNightOutline: ImageVector
    get() {
        if (_cloudyNightOutline != null) {
            return _cloudyNightOutline!!
        }
        _cloudyNightOutline = Builder(name = "CloudyNightOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(388.31f, 272.0f)
                curveToRelative(47.75f, 0.0f, 89.77f, -27.77f, 107.69f, -68.92f)
                curveToRelative(-14.21f, 6.18f, -30.9f, 8.61f, -47.38f, 8.61f)
                arcTo(116.31f, 116.31f, 0.0f, false, true, 332.31f, 95.38f)
                curveToRelative(0.0f, -16.48f, 2.43f, -33.17f, 8.61f, -47.38f)
                curveTo(299.77f, 65.92f, 272.0f, 107.94f, 272.0f, 155.69f)
                arcToRelative(116.31f, 116.31f, 0.0f, false, false, 3.44f, 28.18f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
        }
        .build()
        return _cloudyNightOutline!!
    }

private var _cloudyNightOutline: ImageVector? = null
