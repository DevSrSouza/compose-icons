package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Stackbit: VectorAsset
    get() {
        if (_stackbit != null) {
            return _stackbit!!
        }
        _stackbit = VectorAssetBuilder(name = "Stackbit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.314f, 13.477f)
                lineToRelative(-9.213f, 5.13f)
                lineToRelative(-9.396f, -5.13f)
                arcToRelative(0.729f, 0.729f, 0.0f, false, false, -0.993f, 0.294f)
                arcToRelative(0.729f, 0.729f, 0.0f, false, false, 0.294f, 0.993f)
                lineToRelative(9.746f, 5.333f)
                curveToRelative(0.22f, 0.128f, 0.497f, 0.128f, 0.717f, 0.0f)
                lineToRelative(9.562f, -5.333f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, false, 0.276f, -0.993f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, false, -0.993f, -0.294f)
                close()
                moveTo(3.845f, 10.075f)
                lineToRelative(8.256f, -4.67f)
                lineToRelative(9.195f, 5.314f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 1.011f, -0.276f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.276f, -1.012f)
                lineTo(12.47f, 3.915f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.735f, 0.0f)
                lineTo(1.988f, 9.43f)
                curveToRelative(-0.497f, 0.276f, -0.497f, 0.993f, 0.0f, 1.288f)
                lineToRelative(9.746f, 5.516f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, false, 1.011f, -0.276f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.276f, -1.011f)
                close()
                moveTo(0.057f, 13.937f)
                verticalLineToRelative(-3.678f)
                arcTo(2.258f, 2.258f, 0.0f, false, true, 1.216f, 8.07f)
                lineToRelative(9.745f, -5.517f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 2.28f, 0.019f)
                lineToRelative(9.562f, 5.516f)
                arcToRelative(2.296f, 2.296f, 0.0f, false, true, 1.14f, 2.17f)
                verticalLineToRelative(3.678f)
                arcToRelative(2.288f, 2.288f, 0.0f, false, true, -1.176f, 2.188f)
                lineToRelative(-9.562f, 5.332f)
                arcToRelative(2.281f, 2.281f, 0.0f, false, true, -2.225f, 0.0f)
                lineToRelative(-9.746f, -5.332f)
                curveToRelative(-0.81f, -0.442f, -1.232f, -1.306f, -1.177f, -2.188f)
                close()
            }
        }
        .build()
        return _stackbit!!
    }

private var _stackbit: VectorAsset? = null
