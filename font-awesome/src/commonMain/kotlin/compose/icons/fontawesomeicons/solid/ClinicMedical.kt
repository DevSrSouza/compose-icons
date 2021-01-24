package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ClinicMedical: ImageVector
    get() {
        if (_clinicMedical != null) {
            return _clinicMedical!!
        }
        _clinicMedical = Builder(name = "ClinicMedical", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 115.0f)
                lineTo(69.47f, 307.71f)
                curveToRelative(-1.62f, 1.46f, -3.69f, 2.14f, -5.47f, 3.35f)
                lineTo(64.0f, 496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(512.0f, 311.1f)
                curveToRelative(-1.7f, -1.16f, -3.72f, -1.82f, -5.26f, -3.2f)
                close()
                moveTo(384.0f, 376.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(570.69f, 236.28f)
                lineToRelative(-255.94f, -226.0f)
                arcToRelative(39.85f, 39.85f, 0.0f, false, false, -53.45f, 0.0f)
                lineToRelative(-256.0f, 226.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.21f, 22.6f)
                lineTo(25.5f, 282.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.6f, 1.21f)
                lineTo(277.42f, 81.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.17f, 0.0f)
                lineTo(527.91f, 283.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.6f, -1.21f)
                lineToRelative(21.4f, -23.82f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.22f, -22.59f)
                close()
            }
        }
        .build()
        return _clinicMedical!!
    }

private var _clinicMedical: ImageVector? = null
