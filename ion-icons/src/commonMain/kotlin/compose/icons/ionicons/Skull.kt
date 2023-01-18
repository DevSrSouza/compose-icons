package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(402.0f, 76.94f)
                curveTo(362.61f, 37.63f, 310.78f, 16.0f, 256.0f, 16.0f)
                horizontalLineToRelative(-0.37f)
                arcTo(208.0f, 208.0f, 0.0f, false, false, 48.0f, 224.0f)
                lineTo(48.0f, 324.67f)
                arcTo(79.62f, 79.62f, 0.0f, false, false, 98.29f, 399.0f)
                lineTo(122.0f, 408.42f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, true, 9.75f, 11.72f)
                lineToRelative(10.0f, 50.13f)
                arcTo(32.09f, 32.09f, 0.0f, false, false, 173.12f, 496.0f)
                lineTo(184.0f, 496.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(192.0f, 448.45f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 448.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(240.0f, 448.45f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 272.0f, 448.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(288.0f, 448.45f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 320.0f, 448.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(10.88f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, false, 31.38f, -25.72f)
                lineToRelative(10.0f, -50.14f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 390.0f, 408.42f)
                lineTo(413.71f, 399.0f)
                arcTo(79.62f, 79.62f, 0.0f, false, false, 464.0f, 324.67f)
                verticalLineToRelative(-99.0f)
                curveTo(464.0f, 169.67f, 442.0f, 116.86f, 402.0f, 76.94f)
                close()
                moveTo(171.66f, 335.88f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 52.22f, -52.22f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 171.66f, 335.88f)
                close()
                moveTo(281.0f, 397.25f)
                arcTo(16.37f, 16.37f, 0.0f, false, true, 271.7f, 400.0f)
                lineTo(240.3f, 400.0f)
                arcToRelative(16.37f, 16.37f, 0.0f, false, true, -9.28f, -2.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -6.6f, -16.9f)
                lineToRelative(15.91f, -47.6f)
                curveTo(243.0f, 326.0f, 247.25f, 321.0f, 254.0f, 320.13f)
                curveToRelative(8.26f, -1.0f, 14.0f, 2.87f, 17.61f, 12.22f)
                lineToRelative(16.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 281.0f, 397.25f)
                close()
                moveTo(347.68f, 335.88f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 52.22f, -52.22f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 347.66f, 335.88f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
