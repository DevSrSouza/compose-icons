package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Heart16: ImageVector
    get() {
        if (_heart16 != null) {
            return _heart16!!
        }
        _heart16 = Builder(name = "Heart16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 14.25f)
                lineToRelative(0.345f, 0.666f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.69f, 0.0f)
                lineToRelative(-0.008f, -0.004f)
                lineToRelative(-0.018f, -0.01f)
                arcToRelative(7.152f, 7.152f, 0.0f, false, true, -0.31f, -0.17f)
                arcToRelative(22.055f, 22.055f, 0.0f, false, true, -3.434f, -2.414f)
                curveTo(2.045f, 10.731f, 0.0f, 8.35f, 0.0f, 5.5f)
                curveTo(0.0f, 2.836f, 2.086f, 1.0f, 4.25f, 1.0f)
                curveTo(5.797f, 1.0f, 7.153f, 1.802f, 8.0f, 3.02f)
                curveTo(8.847f, 1.802f, 10.203f, 1.0f, 11.75f, 1.0f)
                curveTo(13.914f, 1.0f, 16.0f, 2.836f, 16.0f, 5.5f)
                curveToRelative(0.0f, 2.85f, -2.045f, 5.231f, -3.885f, 6.818f)
                arcToRelative(22.066f, 22.066f, 0.0f, false, true, -3.744f, 2.584f)
                lineToRelative(-0.018f, 0.01f)
                lineToRelative(-0.006f, 0.003f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(4.25f, 2.5f)
                curveToRelative(-1.336f, 0.0f, -2.75f, 1.164f, -2.75f, 3.0f)
                curveToRelative(0.0f, 2.15f, 1.58f, 4.144f, 3.365f, 5.682f)
                arcTo(20.58f, 20.58f, 0.0f, false, false, 8.0f, 13.393f)
                arcToRelative(20.58f, 20.58f, 0.0f, false, false, 3.135f, -2.211f)
                curveTo(12.92f, 9.644f, 14.5f, 7.65f, 14.5f, 5.5f)
                curveToRelative(0.0f, -1.836f, -1.414f, -3.0f, -2.75f, -3.0f)
                curveToRelative(-1.373f, 0.0f, -2.609f, 0.986f, -3.029f, 2.456f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.442f, 0.0f)
                curveTo(6.859f, 3.486f, 5.623f, 2.5f, 4.25f, 2.5f)
                close()
            }
        }
        .build()
        return _heart16!!
    }

private var _heart16: ImageVector? = null
