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

public val TablerIcons.BuildingWindTurbine: ImageVector
    get() {
        if (_buildingWindTurbine != null) {
            return _buildingWindTurbine!!
        }
        _buildingWindTurbine = Builder(name = "BuildingWindTurbine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                verticalLineToRelative(-2.573f)
                curveToRelative(0.0f, -0.18f, 0.013f, -0.358f, 0.04f, -0.536f)
                lineToRelative(0.716f, -4.828f)
                curveToRelative(0.064f, -0.597f, 0.597f, -1.063f, 1.244f, -1.063f)
                reflectiveCurveToRelative(1.18f, 0.466f, 1.244f, 1.063f)
                lineToRelative(0.716f, 4.828f)
                curveToRelative(0.027f, 0.178f, 0.04f, 0.357f, 0.04f, 0.536f)
                verticalLineToRelative(2.573f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.01f, 9.28f)
                lineToRelative(2.235f, 1.276f)
                curveToRelative(0.156f, 0.09f, 0.305f, 0.19f, 0.446f, 0.3f)
                lineToRelative(3.836f, 2.911f)
                curveToRelative(0.487f, 0.352f, 0.624f, 1.04f, 0.3f, 1.596f)
                curveToRelative(-0.325f, 0.556f, -1.0f, 0.782f, -1.548f, 0.541f)
                lineToRelative(-4.555f, -1.68f)
                arcToRelative(3.624f, 3.624f, 0.0f, false, true, -0.486f, -0.231f)
                lineToRelative(-2.235f, -1.277f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 12.716f)
                lineToRelative(-2.236f, 1.277f)
                arcToRelative(3.624f, 3.624f, 0.0f, false, true, -0.485f, 0.23f)
                lineToRelative(-4.555f, 1.681f)
                curveToRelative(-0.551f, 0.241f, -1.223f, 0.015f, -1.548f, -0.54f)
                curveToRelative(-0.324f, -0.557f, -0.187f, -1.245f, 0.3f, -1.597f)
                lineToRelative(3.836f, -2.91f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, true, 0.446f, -0.3f)
                lineToRelative(2.235f, -1.277f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                horizontalLineToRelative(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                lineToRelative(1.0f, -7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                lineToRelative(1.0f, 7.0f)
            }
        }
        .build()
        return _buildingWindTurbine!!
    }

private var _buildingWindTurbine: ImageVector? = null
