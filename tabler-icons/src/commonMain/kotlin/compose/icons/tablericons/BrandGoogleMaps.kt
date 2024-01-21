package compose.icons.tablericons

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
import compose.icons.TablerIcons

public val TablerIcons.BrandGoogleMaps: ImageVector
    get() {
        if (_brandGoogleMaps != null) {
            return _brandGoogleMaps!!
        }
        _brandGoogleMaps = Builder(name = "BrandGoogleMaps", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.428f, 12.494f)
                lineToRelative(7.314f, -9.252f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.002f, 7.935f)
                lineToRelative(-2.937f, -2.545f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.693f, 6.593f)
                lineToRelative(-8.336f, 9.979f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.591f, 6.376f)
                curveToRelative(0.472f, 0.907f, 0.715f, 1.914f, 0.709f, 2.935f)
                arcToRelative(7.263f, 7.263f, 0.0f, false, true, -0.72f, 3.18f)
                arcToRelative(19.085f, 19.085f, 0.0f, false, true, -2.089f, 3.0f)
                curveToRelative(-0.784f, 0.933f, -1.49f, 1.93f, -2.11f, 2.98f)
                curveToRelative(-0.314f, 0.62f, -0.568f, 1.27f, -0.757f, 1.938f)
                curveToRelative(-0.121f, 0.36f, -0.277f, 0.591f, -0.622f, 0.591f)
                curveToRelative(-0.315f, 0.0f, -0.463f, -0.136f, -0.626f, -0.593f)
                arcToRelative(10.595f, 10.595f, 0.0f, false, false, -0.779f, -1.978f)
                arcToRelative(18.18f, 18.18f, 0.0f, false, false, -1.423f, -2.091f)
                curveToRelative(-0.877f, -1.184f, -2.179f, -2.535f, -2.853f, -4.071f)
                arcToRelative(7.077f, 7.077f, 0.0f, false, true, -0.621f, -2.967f)
                arcToRelative(6.226f, 6.226f, 0.0f, false, true, 1.476f, -4.055f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, 4.811f, -2.245f)
                arcToRelative(6.462f, 6.462f, 0.0f, false, true, 1.918f, 0.284f)
                arcToRelative(6.255f, 6.255f, 0.0f, false, true, 3.686f, 3.092f)
                close()
            }
        }
        .build()
        return _brandGoogleMaps!!
    }

private var _brandGoogleMaps: ImageVector? = null
