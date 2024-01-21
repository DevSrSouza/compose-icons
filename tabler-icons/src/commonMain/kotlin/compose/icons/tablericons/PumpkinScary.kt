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

public val TablerIcons.PumpkinScary: ImageVector
    get() {
        if (_pumpkinScary != null) {
            return _pumpkinScary!!
        }
        _pumpkinScary = Builder(name = "PumpkinScary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                lineToRelative(1.5f, 1.0f)
                lineToRelative(1.5f, -1.0f)
                lineToRelative(1.5f, 1.0f)
                lineToRelative(1.5f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 6.082f)
                curveToRelative(2.609f, 0.588f, 3.627f, 4.162f, 2.723f, 7.983f)
                curveToRelative(-0.903f, 3.82f, -2.75f, 6.44f, -5.359f, 5.853f)
                arcToRelative(3.355f, 3.355f, 0.0f, false, true, -0.774f, -0.279f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, true, -1.59f, 0.361f)
                curveToRelative(-0.556f, 0.0f, -1.09f, -0.127f, -1.59f, -0.362f)
                arcToRelative(3.296f, 3.296f, 0.0f, false, true, -0.774f, 0.28f)
                curveToRelative(-2.609f, 0.588f, -4.456f, -2.033f, -5.36f, -5.853f)
                curveToRelative(-0.903f, -3.82f, 0.115f, -7.395f, 2.724f, -7.983f)
                curveToRelative(1.085f, -0.244f, 1.575f, 0.066f, 2.585f, 0.787f)
                curveToRelative(0.716f, -0.554f, 1.54f, -0.869f, 2.415f, -0.869f)
                curveToRelative(0.876f, 0.0f, 1.699f, 0.315f, 2.415f, 0.87f)
                curveToRelative(1.01f, -0.722f, 1.5f, -1.032f, 2.585f, -0.788f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(0.0f, -1.226f, 0.693f, -2.346f, 1.789f, -2.894f)
                lineToRelative(0.211f, -0.106f)
            }
        }
        .build()
        return _pumpkinScary!!
    }

private var _pumpkinScary: ImageVector? = null
