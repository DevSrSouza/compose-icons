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

public val TablerIcons.IrregularPolyhedronPlus: ImageVector
    get() {
        if (_irregularPolyhedronPlus != null) {
            return _irregularPolyhedronPlus!!
        }
        _irregularPolyhedronPlus = Builder(name = "IrregularPolyhedronPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                lineToRelative(1.752f, -6.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.592f, -1.205f)
                lineToRelative(-6.282f, -2.503f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, false, -1.756f, 0.0f)
                lineToRelative(-6.282f, 2.503f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.592f, 1.204f)
                lineToRelative(1.752f, 6.131f)
                lineToRelative(-1.752f, 6.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.592f, 1.205f)
                lineToRelative(6.282f, 2.503f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, false, 1.756f, 0.0f)
                lineToRelative(0.221f, -0.088f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 5.5f)
                lineToRelative(6.622f, 2.33f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, false, 1.756f, 0.0f)
                lineToRelative(6.622f, -2.33f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                lineToRelative(5.21f, 1.862f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, 1.58f, 0.0f)
                lineToRelative(5.21f, -1.862f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineToRelative(-14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(6.0f)
            }
        }
        .build()
        return _irregularPolyhedronPlus!!
    }

private var _irregularPolyhedronPlus: ImageVector? = null
