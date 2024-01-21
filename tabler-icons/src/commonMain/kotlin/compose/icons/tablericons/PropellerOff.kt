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

public val TablerIcons.PropellerOff: ImageVector
    get() {
        if (_propellerOff != null) {
            return _propellerOff!!
        }
        _propellerOff = Builder(name = "PropellerOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.448f, 10.432f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 4.106f, 4.143f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.272f, 10.272f)
                curveToRelative(0.66f, -1.459f, 1.058f, -2.888f, 1.198f, -4.286f)
                curveToRelative(0.22f, -1.63f, -0.762f, -2.986f, -3.47f, -2.986f)
                curveToRelative(-1.94f, 0.0f, -3.0f, 0.696f, -3.355f, 1.69f)
                moveToRelative(0.697f, 4.653f)
                curveToRelative(0.145f, 0.384f, 0.309f, 0.77f, 0.491f, 1.157f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.169f, 16.751f)
                curveToRelative(0.97f, 1.395f, 2.057f, 2.523f, 3.257f, 3.386f)
                curveToRelative(1.02f, 0.789f, 2.265f, 0.853f, 3.408f, -0.288f)
                moveToRelative(1.479f, -2.493f)
                curveToRelative(0.492f, -1.634f, -0.19f, -2.726f, -1.416f, -3.229f)
                curveToRelative(-0.82f, -0.37f, -1.703f, -0.654f, -2.65f, -0.852f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.664f, 13.0f)
                curveToRelative(-1.693f, 0.143f, -3.213f, 0.52f, -4.56f, 1.128f)
                curveToRelative(-1.522f, 0.623f, -2.206f, 2.153f, -0.852f, 4.498f)
                reflectiveCurveToRelative(3.02f, 2.517f, 4.321f, 1.512f)
                curveToRelative(1.2f, -0.863f, 2.287f, -1.991f, 3.258f, -3.386f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _propellerOff!!
    }

private var _propellerOff: ImageVector? = null
