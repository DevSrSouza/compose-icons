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

public val IonIcons.GlassesOutline: ImageVector
    get() {
        if (_glassesOutline != null) {
            return _glassesOutline!!
        }
        _glassesOutline = Builder(name = "GlassesOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 232.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 200.0f)
                lineTo(464.0f, 200.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 200.0f)
                lineTo(48.0f, 200.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 200.0f)
                curveToRelative(0.0f, 96.0f, 16.0f, 128.0f, 80.0f, 128.0f)
                reflectiveCurveToRelative(80.0f, -32.0f, 80.0f, -128.0f)
                curveToRelative(0.0f, 0.0f, -16.0f, -16.0f, -80.0f, -16.0f)
                reflectiveCurveTo(64.0f, 200.0f, 64.0f, 200.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 200.0f)
                curveToRelative(0.0f, 96.0f, -16.0f, 128.0f, -80.0f, 128.0f)
                reflectiveCurveToRelative(-80.0f, -32.0f, -80.0f, -128.0f)
                curveToRelative(0.0f, 0.0f, 16.0f, -16.0f, 80.0f, -16.0f)
                reflectiveCurveTo(448.0f, 200.0f, 448.0f, 200.0f)
                close()
            }
        }
        .build()
        return _glassesOutline!!
    }

private var _glassesOutline: ImageVector? = null
